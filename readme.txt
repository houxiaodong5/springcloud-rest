示例demo:springcloud集成eureka完成微服务调用


模块说明：
service-center：服务注册中心模块
service1：业务模块一
login-service：业务模块二（此项目中该模块单独用来做登录验证）


业务流程：
用户访问service1模块进行登录验证，service1将次任务分发至login-service模块，
login-service对用户信息进行验证后将验证结果返回给service1,service1将处理结果返回前段。