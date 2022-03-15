# MyFourthServlet

+ Jquery

    01documentReady

        https://matthung0807.blogspot.com/2017/11/jquery-document-ready.html
        JavaScript操縱網頁的DOM元素時，必須等網頁完全載入後才可安全地進行操作
        $( document ).ready(function(){}
        $(function() {}

    02chain

        chain method 可以將動作/方法鏈接在一起。
        $("#p1").css("color", "red").slideUp(2000).slideDown(2000);

    03basicSelector

        選擇和操作 HTML 元素。根據名稱、id、類、類型、屬性、屬性值等“查找”（或選擇）HTML 元素。
        $("*")      ALL
        $("p")      p element
        $(".classDiv")      class name = classDiv
        $("#idsp1")     id = idsp1

    04closestDemo

        https://www.w3schools.com/jquery/jquery_ref_traversing.asp
        Traversing Methods
        siblings() 同階級的
        closest() 最近

    05mouseevent

        blur()      失去焦點
        click()     單點
        dblclick()      點兩下
        contextmenu()       右鍵
        mousedown()       滑鼠點 下
        mouseup()     滑鼠點 起來
        mouseenter()      滑鼠移進去
        mouseleave()      滑鼠移出去
        hover()       滑鼠在上面移動

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

        完成表單判斷
        input 名子 欄位不可以有英文數字
        input 密碼 欄位要同時包含英文數字

        請依照名子欄位的判斷條件完成密碼欄位的判斷


        
