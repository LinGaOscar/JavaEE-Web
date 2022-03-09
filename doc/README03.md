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


    01simple.html

        基本資料型態跟java大同小異
        注意null跟undefined是不一樣的
        logic判斷
        

    02get_ele_content.html

       let x = document.getElementById();
       取得元素當物件來操作
       console.log();
       functione概念

    03get_ele_value.html

        畫面元素取得與判斷
        alert(); 警告視窗
        document.getElementById().value;
        取得物件值
       
    04DOM.html

        文件物件模型（Document Object Model, DOM）是 HTML、XML 和 SVG 文件的程式介面。
        它提供了一個文件（樹）的結構化表示法，並定義讓程式可以存取並改變文件架構、風格和內容的方法。
        DOM 提供了文件以擁有屬性與函式的節點與物件組成的結構化表示。
        節點也可以附加事件處理程序，一旦觸發事件就會執行處理程序。 
        本質上，它將網頁與腳本或程式語言連結在一起。

    05Object.html

        串建物件用JSON格式

    06eventHandler.html

        onclick="f1();"     在標籤內加入function
        document.querySelector("#m2").onclick = f2;     在JS事件處理中加入
        document.querySelector("#m3").addEventListener("click", f3);        在DOM處理器中加入

+ Homework

        完成頁面跳轉過程中都不要顯示網頁址變化
        Forward/Redirect的使用方法

        完成HW1-1 頁面JSP tag 與 JSTL 未完成部分
        scrpitlet 與 c:choose 使用時機

        
