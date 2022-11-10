# 코멘토 직무부트캠프
### IT 대기업 현업 개발자와 함께 하는 SW개발 실무(백엔드) 👨‍💻
<br/>

## 📝 주간 보고서

 - 1주차 - 개발환경 셋팅
 - 2주차 - 프론트엔드 개발자와 백엔드 개발자의 업무 협의 방법 이해
 - 3주차 - 스프링 부트 환경 구축년도의 '총 로그인 수 조회 API 구현' SW를 활용하여 '현황 API'를 위한 SQL 작성
 - 4주차 - SW 활용 현황 API 구현 및 API 가이드 문서 보완
<br/>

## 1주차 - 개발환경 셋팅

### 📌 솔루션 확산을 위한 통계 API 구축 진척 상황 및 주요 이슈 사항

**1.  금주 프로젝트 진척 상황**
 -   API 구축을 위한 개발환경 셋팅 완료 (Version 표 첨부)
       | Library | Version |
       |------|------|
       | JDK | 1.8 |
       | spring-framwork | 5.1.8.RELEASE |
       | Tomcat | 9.0 |
       | maven-compiler | 3.7.0 |
 -   MariaDB(10.2.14)와 MySQL Workbench(8.0.16) 설치하여 샘플 DB 구축
 -   스프링에 MariaDB와 MyBatis를 연동하고 MovieVO.java와 테스트 쿼리를 작성하여 데이터 조회 테스트 완료

**2.  주요 이슈 사항**
    
*[DB 충돌 이슈]*
 -   Situation: MariaDB 설치 후 접속이 되지 않는 접근 거부 에러 발생
 -   Cause: 기존에 사용하던 MySQL과 MariaDB가 같은 port 번호를 사용
 -   Solution: MariaDB의 port 번호를 3307로 변경하여 진행
    
*[context:component-scan ist not bound 에러]*
 -   Situation: root-context.xml에서 context 관련 에러 발생
 -   Cause: context 관련 namespce 누락
 -   Solution: beans 태그에 context 관련한 namespace를 선언하여 해결
 
**3. 차주 계획**
 -   API 가이드 문서 초안 작성
     - 월별 접속자 수
     - 일자별 접속자 수
     - 평균 하루 로그인 수
     - 휴일을 제외한 로그인 수
     - 부서별 월별 로그인 수
