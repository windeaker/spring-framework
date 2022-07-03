package com.windeaker.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class SimpleAspect {

    public SimpleAspect() {
//        log.info("test aop instantiated");
//        try {
//            throw new Exception();
//        }catch (Exception e){
//            log.info("test aop stack trace",e);
//        }

    }

    //
    @Pointcut("within(com.windeaker.core.aop.SimpleService)")
    public void matchMethod(){
    }

    public void matchPackage(){}

    public void matchThis(){

    }

    public void matchTarget(){}

    public void matchBean(){}

    public void matchAnnoMethod(){}

    public void matchWithin(){}

    public void matchAnnoTargetMethod(){}

    public void matchAnnoArgs(){}

    public void matchExecution(){}

    @Before("matchMethod()")
    public void matchMethodBefore(JoinPoint joinPoint){
        System.out.println("切入点执行前");
        printJoinPointInstanceInfo(joinPoint);
    }

    @After("matchMethod()")
    public void matchMethodAfter(JoinPoint joinPoint){
        System.out.println("切入点执行后");
//        printJoinPointInstanceInfo(joinPoint);
    }

    @AfterThrowing(value = "matchMethod()",throwing = "e")
    public void matchMethodAfterThrowing(JoinPoint joinPoint,Exception e) throws Exception {
        System.out.println("切入点抛出异常前执行");
        System.out.println("异常信息："+e.getMessage());
        throw e;
//        printJoinPointInstanceInfo(joinPoint);
    }

    @AfterReturning("matchMethod()")
    public void matchMethodAfterReturning(JoinPoint joinPoint){
        System.out.println("切入点正常运行结束后执行，如果切入点抛出异常，则不执行");
//        printJoinPointInstanceInfo(joinPoint);
    }
    @Around("matchMethod()")
    public Object matchMethodAround(ProceedingJoinPoint joinPoint){
        System.out.println("开始执行环绕通知");
        Object result = null;
        System.out.println("环绕通知：在切入点执行前运行");

        try{
            result = joinPoint.proceed(joinPoint.getArgs());//获取参数
            System.out.println("环绕通知： 在切入点执行后运行,result = " + result);
        } catch (Throwable e) {
            System.out.println("环绕通知： 在切入点执行后抛出exception运行");
            e.printStackTrace();
        } finally {
            System.out.println("finally......");
        }
        System.out.println("环绕通知： 切入点正常运行结束后执行，如果切入点抛出异常，则不执行");
        return result;
    }

    /**
     * 打印切入点实例
     * @param joinPoint
     */
    private void printJoinPointInstanceInfo(JoinPoint joinPoint){
        System.out.println("++++开始打印切入点数据++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("切入点对象实例："+joinPoint.getClass());
        System.out.println("切入点对象参数："+Arrays.toString(joinPoint.getArgs()));
        System.out.println("获取被代理的对象："+joinPoint.getTarget());
        System.out.println("获取代理对象："+joinPoint.getThis());
        System.out.println("连接点类型："+joinPoint.getKind());
        System.out.println("连接点方法所在类文件中的位置："+joinPoint.getSourceLocation());
        System.out.println("连接点静态部分："+joinPoint.getStaticPart());
        System.out.println("获取封装了署名信息："+joinPoint.getSignature());
        getMethodArgsName(joinPoint);
        System.out.println("++++结束打印切入点数据++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    // 获取方法的参数名称
    private void getMethodArgsName(JoinPoint joinPoint){
        Signature signature = joinPoint.getSignature();//此处joinPoint的实现类是MethodInvocationProceedingJoinPoint
        MethodSignature methodSignature = (MethodSignature) signature;//获取参数名
        for(int i=0;i<methodSignature.getParameterNames().length;i++){
            System.out.println(methodSignature.getParameterNames()[i]);//这就是每个参数的名字
        }
    }




}
