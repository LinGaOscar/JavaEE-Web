# MyThirdServlet

+ HTML

    index.html

        < a >       超連結 tag

    ele_org.html

        < h2 >      標題
        < div >     分隔區塊
        < p >       段落文字
        < span >    無分段文字
        < img >     圖片

    ele_pg.html

        實作畫面

    form.html

        < form >    可以設定GET / POST 
        < input >   可以選行各種輸入內容
        tag 內有各種屬性 name id class等

    table.html

        < table >    表格 < td > 直 < tr > 橫


+ JavaScript

    雖然 "Java" 和 "JavaScript" 都是 Oracle 公司在美國和其他國家的商標或註冊商標，但兩個語言有著非常不同的語法、語意和用途。因為用作網頁的腳本語言而大為知名。

    < script > 作用範圍


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

        
