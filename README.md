# demo-srpingboot

1. springboot API 서버 샘플 코드
2. Maven 프로젝트 설정(pom.xml)
3. github workflow CI 적용 (.github/workflows/action.yml)
4. docker image build 후 github package 업로드
 - package url : https://github.com/users/bacsumu/packages/container/package/demo-springboot
 - image url : docker pull ghcr.io/bacsumu/demo-springboot:latest
5. helm chart 생성
 - charts/demo-springboot
5. argocd 설치된 k8s에서 application 등록 및 CD 적용
 - AWS 테스트 : kubectl apply -f https://raw.githubusercontent.com/bacsumu/demo-srpingboot/main/argocd-application-aws.yaml
 - On-premise 테스트 : kubectl apply -f https://raw.githubusercontent.com/bacsumu/demo-srpingboot/main/argocd-application-dev.yaml
