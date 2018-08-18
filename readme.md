# Hateoas

```
# set lombok
http://blog.woniper.net/229


# test
- 주의사항
    - 테스트 클래스에 @WebMvcTest 어노테이션을 추가해서 특정 컨트롤러를 지정
    - @WebMvcTest 어노테이션을 사용하면 @Controller, @Component, @ControllerAdvice등이 작성된 코드를 인식
    - 컨트롤러를 테스트하려면 org.springframework.test.web.servlet.MockMvc 타입의 객체를 사용한다.
    - @WebMvcTest와 같이 사용하면 별도의 생성 없이 주입(@Autowired)만으로 코드를 작성할 수 있다.
```