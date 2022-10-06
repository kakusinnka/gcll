# gcll
使用 google-cloud-logging-logback 写日志到cloud logging.

* 创建SpringBoot工程。
* 安装 Docker Desktop.
* Vs Code 安装 Docker 插件。
* mvn 打包：mvn clean package
* 右键 Dockerfile -> build image -> [gcr.io/my-project-29437-364300/gcll:latest]
* Ctrl + Shift + P -> Docker push -> [gcr.io/my-project-29437-364300/gcll:latest]
* 部署到 Cloud Run