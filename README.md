# gmall20190826 项目搭建过程
##gmall-user：用户服务8080
    ①springboot配置文件
        #端口号
        server.port=8080
        #jdbc
        spring.datasource.username=root
        spring.datasource.password=111111
        spring.datasource.url=jdbc:mysql://192.168.40.128:3306/gmall?serverTimezone=Asia/Shanghai&useUnicode=true&characterEncoding=utf8&useSSL=false
        
        #mybatis
        mybatis.mapper-locations=classpath:mapper/*Mapper.xml
        #下划线转驼峰
        mybatis.configuration.map-underscore-to-camel-case=true
    ②controller、service
    ③bean的映射类、映射数据库的ums_user_member表
    ④写具体功能
   
##gmall-parent
    主要放的是一些公共的依赖
    
##gmall-api
    主要放的是一些接口和一些配置文件
    
##gmall-commom-utils
    
##gmall-service-utils
    引入：gmall-service-utils
    