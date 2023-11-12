# problem detail demo


3개의 각기 다른 방식의 Error 처리 방식으로 보여주는 예제 입니다.

user 에 아래처럼 알파벳 대소문자만 허용하는 validation check 가 들어있습니다.
```
Pattern.matches("[a-zA-Z]+",user);
```
그래서 
> http://localhost:8080/users/Harris 호출 시 200 성공 리턴 합니다

> http://localhost:8080/users/Harris1 호출 시 숫자는 허용하지 않으므로, 500 Error 리턴 합니다


Error 처리 비교를 위해, 아래처럼 4개의 모듈로 구성되어 있습니다.


### i default
error handling 이 없는 예제 입니다.
* 8080 포트를 사용합니다
```
{
  "timestamp": "2023-11-12T09:40:37.491+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "path": "/users/Harris1"
}
```
### ii old
ErrorResponse 를 직접 만들고, @RestControllerAdvice, @ExceptionHandler 를 사용한 예제 입니다.
* 8081 포트를 사용합니다
```
{
  "time": "2023-11-12T18:41:29.472853",
  "status": 400,
  "error": "Bad Request",
  "message": "user 명은 알파벳 대소문자만 허용됩니다",
  "path": "/users/Harris12"
}
```

### iii problemdetail
ProblemDetail 을 사용한 예제 입니다.
* 8082 포트를 사용합니다
```
{
  "type": "about:blank",
  "title": "Bad Request",
  "status": 400,
  "detail": "user 명은 알파벳 대소문자만 허용됩니다",
  "instance": "/users/Harris123",
  "timestamp": "2023-11-12T18:43:12.218058"
}
```

### common
swagger 와 message class 를 공통으로 사용하기 위한 모듈 입니다
