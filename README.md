# StarCraft_App

Machine-AirUnit
  - Dropship

Dropship 유닛의 정보를 나타내는 Dropship 킅래스 생성(체력, 공격력, 방어력)
  - AirUnit을 부모 클래스로 Dropship 이라는 명의 class를 생성
  - Repairable 인터페이스를 구현할 수 있게 연결

Dropship 클래스 안에 super() 사용으로 부모 클래스의 생성자를 호출하여 사용할 수 있게 해주었다.
현재의 HP와 최대 HP를 같게 설정하여 처음 실행 돌릴 시, HP 상태를 설정한 HP가 되도록 나타낸다.

currentHP, ATK, DEF 세팅을 최고 조상인 Unit의 currentHP, ATK, DEF 값과 같게 설정

Test-StarCraftAppTest 추가
Dropship으로 공격, 공격 당할 시에 유닛의 hp가 해당값만큼 정상적으로 수치가 변하는지 테스트
