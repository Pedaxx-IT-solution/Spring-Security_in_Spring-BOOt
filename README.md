# Spring-Security_in_Spring-BOOt
Basics of spring security




<h4>`1st question how to add spring-security in our spring-boot project`</h4> <br>
 --> so just by adding `spring-boot-starter-security` dependancy in our project. <br>
 
 <h4> After adding dependancy default behaviour provided by spring security     </h4><br>
 --> ADDS MANDATORY AUTHENTICATION FOR URL'S<br> 
 --> ADDS LOGIN FORMS <br>
 --> HANDLES LOGIN ERROR <br>
 --> CREATES A USER AND SETS A DEFAULT PASSWORD WHICH WE WILL BE GETTING IN CONSOLE.( THIS CHANGES EVERY TIME).<br>
 
 <h4> WHAT SPRING SECURITY CAN DO ?      </h4> <br>
 --> USERNAME / PASSWORD AUTHENTICATION       <br>
 --> SSO/OKTA/LDAP (Okta has a specific library for Spring Boot to make it easy to add OAuth 2.0 authentication to your app.  ) <br>
     https://developer.okta.com/blog/2019/12/03/spring-boot-deploy-options
 --> APP LEVEL AUTHORIZATION. <br>
 --> INTRA APP AUTHORIZATION LIKE Outh. <br>
 --> MICROSERVICES SECURITY (using TOKENS , JWT ).<br>
 --> METHOD LEVEL SECURITY.<br>
 
 <h4> Why Spring Security ?  </h4><br>
 --> First it provides `application level security`<br>
 --> login and logout functionality <br>
 --> allow/block url's of particular user's <br>
 
 SPRING SECURITY IS LIKE A WATCHMAN IN OUR SOCIETY WHO'S JOB IS TO PROTECT THE SOCIETY FROM INTRUDERS <br>
 
 WATCHMAN ASKS TWO QUESTION <br> 
 1.> WHO ARE YOU? (AUTHENTICATE ) <br>
 2.> WHAT DO YOU WANT? (AUTHORIZATION) <br>
 
 
 SPRING SECURITY HANDLES COMMON VULNERABILITIES LIKE `SESSION FIXATION` , `CLICKJACKING` , `CLICK SITE REQUEST FORGERY`   <br>
 
