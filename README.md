# StarCraft_App

건물 liftOff(이륙) land(착륙)을 위한 Liftable interface 작성 및 메소드 구현을 위한 LiftalbeImpl 생성

각 건물,유닛에 이륙, 착륙 상태 구분을 위한 boolean isGround 추가
true 착륙 상태
false 이륙 상태

Building
- Barracks
- CommanCenter
- Factory
- Starpoty

Machine -AirUnit
- BattleCruiser

Machine-GroundUnit
- Goliath
- Vulture

추가

StarCraftAppTest 에서 Building들 이, 착륙 상태 변경 확인 테스트
StarCraftAppTest_2 에서 건물, 유닛들의 이,착륙 상태를 isGround로 정상 확인 가능한지 테스트

