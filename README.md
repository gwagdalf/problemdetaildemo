# problem detail demo


3개의 각기 다른 방식의 Error 처리 방식으로 보여주는 예제 입니다.


아래처럼 4개의 모듈로 구성되어 있습니다.


### i default
error handling 이 없는 예제 입니다.

### ii old 
ErrorResponse 를 직접 만들고, @RestControllerAdvice, @ExceptionHandler 를 사용한 예제 입니다.

### iii problemdetail
ProblemDetail 을 사용한 예제 입니다.

### common
swagger 와 message class 를 공통으로 사용하기 위한 모듈 입니다
