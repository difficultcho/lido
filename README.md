在 intellij idea 上使用集成 tomcat 部署时遇到问题的归纳：

0. 必要的 war 包，和 exclude spring-boot-starter-tomcat
1. java 17 可能和低版本的 tomcat 不兼容，需要使用 tomcat 10.1.0
2. 在 project structure 下可以配置“project compiler output”，设置到 /target 下，这样就不会把编译后的文件放到 /out 下
3. artifacts 的位置指向 /target
4. 配置 project structure 下的 web module，会自动生成一个 /web/WEB-INF/web.xml 目录，但 Web Resource Directory 的值可不存在

API 设计：
新增 -
    新增用户 /user/add POST
    新增课程 /course/add POST
    新增用户-课程关系 /userLecture/add POST
    新增学生成绩记录 /studentTestGrade/add POST

删除 -
    删除用户 /user/delete POST
    删除课程 /course/delete POST
    删除用户-课程关系 /userLecture/delete POST
    删除学生成绩记录 /studentTestGrade/delete POST

修改 -
    修改用户 /user/update POST
    修改课程 /course/update POST
    修改用户-课程关系 /userLecture/update POST
    修改学生成绩记录 /studentTestGrade/update POST

查询 -
    查询用户 /user/query GET
    查询课程 /course/query GET
    查询用户-课程关系 /userLecture/query GET
    查询学生成绩记录 /studentTestGrade/query GET