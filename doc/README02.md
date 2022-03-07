# MySecondServlet

+ Get / Post Form

    JSP
        網址http://localhost:8080/MySecondServlet/jsp/JSPtag/Attribute.jsp
                                project name/folder/folder/html/jsp

    doGet in doPost
    一般是在教科書或者不需要區分get還是post方法呼叫的場合下使用。
    request.getParameter("paramate");

+ JSP

    JSPtoJSP

        Java Server Pages 利用JSP標籤在HTML中使用Java，JSP是Servlet的擴充套件
        可以使用servlet的處理業務邏輯，由Java servlet的模板引擎支持的模式組合使用。

    JSP tag

        <%      %> scriptlet    主要用來在jsp頁面寫java程式碼
        <%@     % > 指令        主要用來設定和這個頁面有關內容
        <%=     % > 運算式      等同於在scriptlet 外使用out.print(); 所以裡面不用加;

        不方便維護切版人員 網頁編輯人員 不一定會看得懂程式碼

    JSTL

        c:set
        scope=”request” 對應於JSP的request，以及servlet的request
        scope=”session” 對應於JSP的session，以及servlet的request.getSession()
        scope=”application” 對應於JSP的application，以及servlet的this.getServletContext()
        scope=”page”，在JSP在對應爲jsp的pageContext這個內置對象，可是在servlet中，卻找不到對應的對象。
        <c:if> <c:choose> <C:when>

+ Homework

        完成頁面跳轉過程中都不要顯示網頁址變化
        Forward/Redirect的使用方法

        完成HW1-1 頁面JSP tag 與 JSTL 未完成部分
        scrpitlet 與 c:choose 使用時機

        
