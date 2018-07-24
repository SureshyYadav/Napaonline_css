<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" href="resources/css/Search.css"/> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
}

/* Style the submit button */
form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid grey;
  border-left: none; /* Prevent double borders */
  cursor: pointer;
}

form.example button:hover {
  background: #0b7dda;
}

/* Clear floats */
form.example::after {
  content: "";
  clear: both;
  display: table;
}

</style>
</head>
<body>
<form class="example" action="doSearch" method="POST">
  <input type="text" placeholder="Search.." name="search">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
</body>
</html> --%>




<!DOCTYPE html>
<html lang="en">
<head>
    <!-- META SECTION -->
    <title>Mkyong Wildfly Example</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <!-- END META SECTION -->
    <!--  BEGIN STYLE -->
    <style>
        table, th, td {
            border: 1px solid black;
            padding: 1px;
        }
    </style>
    <!--  END STYLE -->

</head>
<body>
<form action="doSearch"  th:object="${search}" method="POST">
    <label for="search_input">Search:</label> <input name="search"
                                                     id="search">
    </input>
    <%-- <div th:if="${not #lists.isEmpty(search)}">
        <h2>Search Results</h2>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>name</th>
                <th>rarity level</th>
                <th>year</th>
            </tr>
            </thead>
            <tbody>
            <tr th:each="search : ${search}">
                <td th:text="${search.id}">Text ...</td>
                <td th:text="${search.name}">Text ...</td>
                <td th:text="${search.rarityLevel}">Text ...</td>
                <td th:text="${search.year}">Text...</td>
            </tr>
            </tbody>
        </table>
    </div> --%>
</form>
</body>
</html>