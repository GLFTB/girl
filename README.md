#三种启动spring boot的方法

1.直接在idea中运行

2.进入 cmd 环境中，切换到项目路径中，然后输入 mvn spring-boot:run 回车，项目就可以启动了

3.和方法二一样，进入cmd 环境中，切换到项目下，然后将项目编译，编译成功在项目下的 target 文件下会多一个 jar 文件，所以我们切换到 target 文件下,然后我们开发启动项目，输入java -jar 编译好的项目