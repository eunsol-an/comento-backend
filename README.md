# 코멘토 직무부트캠프
### IT 대기업 현업 개발자와 함께 하는 SW개발 실무(백엔드) 👨‍💻
<br/>

## 📝 주간 보고서

 - [1주차 - 개발환경 셋팅](#1주차---개발환경-셋팅)
 - [2주차 - 프론트엔드 개발자와 백엔드 개발자의 업무 협의 방법 이해](#2주차---프론트엔드-개발자와-백엔드-개발자의-업무-협의-방법-이해)
 - [3주차 - 스프링 부트 환경 구축과 연도별 총 로그인 수 조회 API 구현](#3주차---스프링-부트-환경-구축과-연도별-총-로그인-수-조회-API-구현)
 - [4주차 - SW 활용 현황 API 구현 및 API 가이드 문서 보완](#4주차---SW-활용-현황-API-구현-및-API-가이드-문서-보완)
<br/>

## 1주차 - 개발환경 셋팅

### 📌 통계 API 구축을 위한 Spring 개발환경 셋팅 및 테스트

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

## 2주차 - 프론트엔드 개발자와 백엔드 개발자의 업무 협의 방법 이해

### 📌 인터페이스 가이드 문서 작성

**1.  금주 프로젝트 진척 상황**
 - [REST API에 대한 학습](https://github.com/eunsol-an/comento-backend/wiki/REST-API)
 - [API 가이드 문서 초안 작성](https://drive.google.com/file/d/14jNRA5kcTL4B3ZbTzgZns9jrhWWh_l2E/view?usp=sharing)
     - 월별 접속자 수
     - 일자별 접속자 수
     - 평균 하루 로그인 수
     - 휴일을 제외한 로그인 수
     - 부서별 월별 로그인 수

**2. 차주 계획**
 - 간단한 RESTful  API 구현
 - Springboot 개발환경을 세팅하고 Spring과 어떤 차이점이 있는지 비교
 
## 3주차 - 스프링 부트 환경 구축과 연도별 총 로그인 수 조회 API 구현

### 📌 Spring boot 개발환경 셋팅 및 간단한 RESTful API 구현

**1.  금주 프로젝트 진척 상황**
 -   Spring boot 개발환경 셋팅 후 테스트 완료 (Version 표 첨부)
	  | Library | Version |
	  |------|------|
	  | JDK | 1.8 |
	  | spring-boot | 2.2.2.RELEASE |
![image](https://user-images.githubusercontent.com/87196958/204021926-787a5938-c3f7-4a34-b29c-d513f7d4cbdd.png)
 -   통계 API(SW 활용 현황)을 위한 DB, TABLE 생성
 -   [20년도 로그인 수 API] Spring boot, mybatis, mariadb 연동 후 테스트 완료</br>
![image](https://user-images.githubusercontent.com/87196958/204022231-87b3025a-c746-480e-8e16-d5a4b727e156.png)

**2. 차주 계획**
 - 통계 API 개발
 - 완성된 API를 가지고 2주차에 진행했던 API 가이드 문서 보완
 - '휴일을 제외한 로그인 수'의 경우 단순 쿼리가 아닌 Java 코드를 조합하여 작성(공공API를 통해 휴일 정보 받아오기)
