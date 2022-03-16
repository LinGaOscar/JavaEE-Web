# MyFourthServlet

+ Jquery

    01basicSelector

        選擇和操作 HTML 元素。根據名稱、id、類、類型、屬性、屬性值等“查找”（或選擇）HTML 元素。
        $("*")      ALL
        $("p")      p element
        $(".classDiv")      class name = classDiv
        $("#idsp1")     id = idsp1

    02chain

        chain method 可以將動作/方法鏈接在一起。
        $("#p1").css("color", "red").slideUp(2000).slideDown(2000);

    03documentReady

        JavaScript操縱網頁的DOM元素時，必須等網頁完全載入後才可安全地進行操作
        $( document ).ready(function(){}
        $(function() {}

    04this

        誰在調用的當下就代表誰，一個變數的形式
        this. JS 的調用方法
        $(this). JQ的調用方法

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

    06closestDemo

        https://www.w3schools.com/jquery/jquery_ref_traversing.asp
        Traversing Methods
        siblings() 同階級的
        closest() 最近