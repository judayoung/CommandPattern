# CommandPattern
Command Pattern with button example And STREET FIGHTER example

# 사용 이유
Invoker의 메서드를 실행할 때, Command에 따른 다양한 기능을 선택할 수 있도록 한다. 
다양한 기능을 Invoker의 단일 메서드로 수행하려면 Command를 추상화해야 한다.

# 상세 내용
Invoker의 메서드를 Command의 execute메서드가 받는다. Command의 구현 클래스에서 Receiver의 메서드를 호출한다.
