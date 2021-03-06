FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
ENV BOT_NAME = JRTB_demo_bot
ENV BOT_TOKEN=2139588663:AAHfsjxd-v5Fs_hkzLxcZX5VoNET5B4RmzE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java", "-Dbot.username=${BOT_NAME}", "-Dbot.token=${BOT_TOKEN}", "-jar", "/app.jar"]