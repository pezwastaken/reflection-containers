FROM eclipse-temurin:17-jdk-jammy

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    gnupg2 \
    lsb-release \
    git \
    python3 \
    build-essential \
    && rm -rf /var/lib/apt/lists/*


WORKDIR /tai-e

RUN git clone https://github.com/pascal-lab/Tai-e.git

WORKDIR /tai-e/Tai-e

RUN wget https://github.com/pascal-lab/Tai-e/releases/download/v0.5.2/tai-e-all-0.5.2.jar

RUN git checkout v0.5.2 && git submodule update --init --recursive

RUN ls /tai-e/Tai-e

ENTRYPOINT ["java", "-jar", "/tai-e/Tai-e/tai-e-all-0.5.2.jar"]


