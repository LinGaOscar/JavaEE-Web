# MyFirstServlet

+ hello

        HelloWorld
            
            create Dynamic Web Project
            create New Server -> add and remove
            src-> new servlet
            package / name 
            super();
            @WebServlet
            localhost:8080/projectName/@path
            doPost is doGet 
            response.getWriter().append("Hello World");

        GetWirte 編寫畫面
            response.getWriter().println("<!DOCTYPE html>");

+ getparam 取參數

        GetParam 
        String username = request.getParameter("username");
		request.setAttribute("username", username);
		

+ forward 轉發

        ForwardOrigin / ForwardOther 轉發 / 被轉發
        到轉發頁面ForwardOrigin 會被轉發到 ForwardOther
        request.getRequestDispatcher("/ForwardOther").forward(request, response);


        ForwardSetAttr / ForwardReqAttr 轉發 / 被轉發 收值與取值
        ForwardSetAttr -> request.setAttribute("username", username);
        ForwardReqAttrc -> request.getAttribute("username");

+ sendredirect 重導

        SendRedirect 重導
        完整網路路徑
        response.sendRedirect("http://www.yahoo.com.tw");
        本地端的靜態頁面
        response.sendRedirect("html/SendRedirect.html");

+ Cookies

        CookiesSet -> CookiesReq
        Cookie cookie = new Cookie("key","value");
        cookie.getName() / cookie.getValue()

+ Sessions

        SessionSet -> SessionReq
        session.setAttribute(key, value);
        request.getSession().getAttribute("key");

+ Homeworl

        創立Homework2 servlet 
        將畫面1-100表格改成9*9表