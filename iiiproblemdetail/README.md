# type uri example

### /users/{user}

user 는 알파벳 대소문자만 입력 가능합니다

```
Pattern.matches("[a-zA-Z]+",user);
```

알파벳을 제외한, 숫자나 특수문자등이 입력되면, BAD REQEST 에러가 발생합니다.



### Guides
> GET /users

를 호출하여 정확한 user 명을 확인하세요



### Additional Links

https://github.com/gwagdalf/problemdetaildemo
