# Calculator
문자열 계산기
POJO / JAVA만 사용해서 진행

기능 요구사항
1. 사용자가 입력한 문자열 값에 따라 사칙연산을 수행하는 계산기 구현
2. 입력 문자열의 숫자와 사칙 연산 기호 사이에는 공백이 포함되어야 한다.
3. 숫자는 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달 할 경우 구분자를 기준으로 분리한 각 숫자와, 마지막에 하나의 공백을 가지고 전달된 연산자의 계산 결과를 반환. (아래 입출력예시 참고)
4. 연산자의 경우 하나만 입력 받는다.
5. 사친 연산만 포함한다.
6. 소숫점의 경우 0.1, 0.2 와 같이 소숫점 첫째짜리까지 표시
7. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생 시킨다.

입력 예시
1. 1:2,3:4 +
2. 6:10,2:3 *
3. 7,2:3 -
4. 4:2,5 /

출력 예시
1. 1 + 2 + 3+ 4 = 10
2. 6 * 10 * 2 * 3 = 360
3. 7 - 2 - 3 = 2
4. 4 / 2 / 5 = 0.4

구현 내용 및 Task
1. 사용자 입력 구현
2. 입력 값 예외 케이스 구현
3. 입력 검증 기능
4. 구분자로 숫자 추출 기능 구현
5. 사칙연산자 추출 기능 구현
6. 사칙연산자에 따른 계산 기능 구현
7. 출력 기능 구현









