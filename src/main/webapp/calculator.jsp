<html lang="en">
<head>
    <title>JSP Calculator</title>
    <link rel="stylesheet" href="https://unpkg.com/purecss@2.1.0/build/pure-min.css" integrity="sha384-yHIFVG6ClnONEA5yB5DJXfW2/KC173DIQrYoZMEtBvGzmf0PKiGyNEqe9N6BNDBH" crossorigin="anonymous">
</head>
<body>
    <h1>Calculator</h1>
    <form>
        <%
            int result = 0;
            String inputNumber = request.getParameter("value");
            result = Integer.parseInt(inputNumber);
        %>
        <output><%=result%></output>
        <form action="?" method="get">
            <label>Liczba: </label>
            <input type="number" name="value"/>
            <input type="submit" value="+"/>
        </form>
    </form>
</body>
</html>