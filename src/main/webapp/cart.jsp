<html>
<head>
    <title>Online Book Store</title>
    <style>
        input.btn{
            background-color: deeppink;
            width: 50%;
            height: 50px;
            color: white;
            font-size: 15px;
            float: right;
            border-radius: 5px;
        }
        input.txt{
            border-color: black;
            border-width: 0;
            border-bottom-width: 1px;

        }
        h1{
            margin-top: 80px;
        }

    </style>
</head>
<body>
    <form action="addToCart" method="post">
        <h1 align="center"><span style="color: deeppink">MY CART</span></h1>
        <br>
        <table align="center" cellspacing="10" cellpadding="10">
            <tr>
                <td>NAME</td>
                <td><input type="text" name="Name" class="txt"></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="qty" class="txt"></td>
            </tr>
            <tr>
                <td>Colour</td>
                <td>Red<input type="radio" name="colour" class="txt" value="red"></td>
                <td>Green<input type="radio" name="colour" class="txt" value="green"></td>
                <td>Blue<input type="radio" name="colour" class="txt" value="blue"></td>
            </tr>
            <tr>
                <td>Size</td>
                <td>Small<input type="checkbox" name="size" class="txt" value="small"></td>
                <td>Medium<input type="checkbox" name="size" class="txt" value="medium"></td>
                <td>Large<input type="checkbox" name="size" class="txt" value="large"></td>
            </tr>
                <td colspan="2"><input type="submit" name="submit" value="ADD TO CART" class="btn"></td>
            </tr>
        </table>
    </form>
</body>
</html>
