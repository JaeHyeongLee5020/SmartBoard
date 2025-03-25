# 📇 연락처 관리 게시판 - week7_BBS

**week7_BBS**는 Spring Boot 기반의 연락처 관리 게시판(Contact Board) 웹 애플리케이션입니다.  
사용자는 연락처 정보를 등록, 조회, 수정, 삭제할 수 있으며, H2 DB 및 Thymeleaf 기반 UI로 구성되어 있습니다.

---

## ✅ 주요 기능

### 1. 연락처 등록
- 이름, 연락처, 이메일, 주소, 등록일 입력
- 등록 후 목록 페이지로 이동

### 2. 연락처 목록 조회
- 전체 연락처 목록을 테이블로 출력
- ID, 이름, 연락처 주요 정보 확인 가능

### 3. 상세 보기
- 개별 연락처의 상세 정보 확인

### 4. 수정 및 삭제
- 연락처 정보를 수정하거나 삭제 가능

---

## 🧱 주요 구성 요소

| 구성 요소              | 설명                                           |
|------------------------|------------------------------------------------|
| `Contact`              | 연락처 엔티티 클래스 (JPA 사용)                |
| `ContactRepository`    | Spring Data JPA 인터페이스                     |
| `ContactService`       | 비즈니스 로직 담당 서비스 클래스               |
| `ContactController`    | URL 요청을 처리하는 웹 컨트롤러                |
| `list.html`            | 전체 연락처 목록을 보여주는 Thymeleaf 뷰       |
| `form.html`            | 등록/수정용 입력 폼                            |
| `view.html`            | 개별 상세 정보 출력용 뷰                       |

---

## 🛠️ 사용 기술 스택

| 항목          | 기술                              |
|---------------|-----------------------------------|
| 프레임워크     | Spring Boot                       |
| 빌드 도구      | Gradle                             |
| 백엔드        | Java, Spring Web, Spring Data JPA |
| 데이터베이스   | H2 Database (In-memory)           |
| 프론트엔드    | Thymeleaf, HTML, Bootstrap        |
| 기타          | Lombok, @RequiredArgsConstructor 등 사용 |

---

## ⚙️ 실행 방법

1. 프로젝트 클론 또는 압축 해제 후 IDE에서 열기
2. `./gradlew bootRun` 또는 IDE에서 실행
3. 브라우저에서 `http://localhost:8080/contacts` 접속

---

## 📌 프로젝트 목적

> Spring Boot, Gradle, JPA, Thymeleaf 등을 활용한  
> **기초적인 CRUD 웹 애플리케이션 개발 실습**을 통해 전체 개발 흐름을 익히는 데에 목적이 있습니다.

---
