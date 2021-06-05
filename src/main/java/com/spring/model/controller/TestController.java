package com.spring.model.controller;

import com.spring.model.common.Result;
import com.spring.model.strategypattern.CashContext;
import com.spring.model.strategypattern.CashFactory;
import com.spring.model.strategypattern.CashSuper;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @ApiOperation("策略模式")
    @RequestMapping(value="strategypattern", method = RequestMethod.GET)
    public Result getTotalStrategy(Double money, Integer num,String type){
        Result rs=new Result();
        if(money==null|| num==null)
        {
            rs.setCode(300);
            rs.setMsg("输入参数不能为空");
            return rs;
        }else{
            CashContext cashContext=new CashContext(type);
            double totalPrice=cashContext.getResult(money*num);
            rs.setMsg("totalPrice:"+totalPrice);
        }
        return rs;
    }

    @ApiOperation("简单工厂模式")
    @RequestMapping(value="factorypattern", method = RequestMethod.GET)
    public Result getTotal(Double money, Integer num,String type){
        Result rs=new Result();
        if(money==null|| num==null)
        {
            rs.setCode(300);

            rs.setMsg("输入参数不能为空");
            return rs;
        }else{
            CashSuper cashSuper= CashFactory.createCashAccept(type);
            double totalPrice=cashSuper.acceptCash(money*num);
            rs.setMsg("totalPrice:"+totalPrice);
        }
        return rs;
    }

    @ApiOperation("测试请求")
    @RequestMapping(value="test", method = RequestMethod.GET)
    public String test(double money,int num){
        return "sucess";
    }
}