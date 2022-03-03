# MyFirstServlet

+ hello

        HelloWorld
            src-> new servlet
            package / name 
            super();
            @WebServlet
            localhost:8080/projectName/@path
            doPost is doGet 
            response.getWriter().append("Hello World");

        Servlet
            網址http://localhost:8080/MySecondServlet/GetForm
            專案名稱/ClassName

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