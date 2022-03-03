1. 设置编码
   - request.setCharacterEncoding("utf-8");
2. Servlet的继承关系
3. Servlet的生命周期
   - init(), service(), destroy()
   - 单例，线程不安全
     - 不要创建成员变量，修改成员变量的值，或者根据成员变量的值做逻辑判断
4. Http协议
   - 请求行
   - 请求头
   - 请求体
   - HTTP是无状态的：http无法知道两次请求是不是同一个客户端发送过来的
   - 通过会话跟踪技术来解决无状态的问题
5. 会话
6. 服务器内部转发和客户端重定向
   - 服务器内部转发：request.getRequestDispatcher("...").forward(request, response);
   - 客户端重定向：response.sendRedirect();
7. Thymeleaf -视图模板技术
   1. 添加thymeleaf的jar包
   2. 新建一个servlet类ViewBaseServlet
   3. 在web.xml中添加配置
      1. 配置前缀view-prefix
      2. 配置后缀view-suffix 
   4. 使我们的Servlet继承ViewBaseServlet
   5. 根据逻辑视图名称得到物理视图名称