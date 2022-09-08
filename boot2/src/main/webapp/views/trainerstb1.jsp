<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" 
    xmlns:th="http://www.thymeleaf.org" 
    xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
    xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">
    
<head>
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>k</title> 
</head>
<body>
<table>
<th>Trainer_id</th>
<th>Trainer_name></th>
<th>Trainer_email></th>
<tbody>
               <th:block th:each="Trainer:${result}">
                 <tr>
<!--                    <td class="lalign">silly tshirts</td> -->

                   <td>[[${Trainer.id }]]</td>
                   <td>[[${Trainer.name }]]</td>
                   <td>[[${Trainer.email}]]</td>
                  
                 </tr>
                 </th:block>
               </tbody>
</table>
</body>
</html>