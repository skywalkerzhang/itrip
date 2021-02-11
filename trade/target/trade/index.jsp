<html>
<head>

    <script src="jquery-1.12.4.min.js"></script>
    <script src="qrcode.js"></script>

</head>
<body>
<h2>Hello World! i am trade module</h2>




this is trade!! welcome!trade
<input type="button" value="wxbuy" id="tob" />

<div id="qrcode"></div>
<script type="text/javascript">
    $(document).ready(function () {
        $("#tob").click(function () {
            $.ajax({
                "url":"wxbuy?oid=1234",
                "dataType":"json",
                "type":"get",
                success:function (msg) {
                    if(msg.code_url) {
                        new QRCode(document.getElementById("qrcode"), msg.code_url);
                    }else{
                        document.getElementById("qrcode").innerHTML="some thing wrong was happen";
                    }
                }
            });
        });

    });



</script>




</body>
</html>
