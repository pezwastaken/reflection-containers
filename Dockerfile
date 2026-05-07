FROM eclipse-temurin:17-jdk-jammy

RUN apt-get update && apt-get install -y \
    wget \
    unzip \
    gnupg2 \
    lsb-release \
    git \
    python3 \
    build-essential \
    cmake \
    mcpp \
    libffi-dev \
    zlib1g-dev \
    openjdk-8-jre-headless \
    && rm -rf /var/lib/apt/lists/*


ENV DOOP_PLATFORMS_LIB=/doop

# really weird workaround since doop adds a specific suffix to the jre path
RUN mkdir -p /doop/JREs/jre1.8/lib/ && \
    ln -s /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar /doop/JREs/jre1.8/lib/rt.jar && \
    ln -s /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar /doop/JREs/jre1.8/lib/jce.jar && \
    ln -s /usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar /doop/JREs/jre1.8/lib/jsse.jar

RUN wget https://souffle-lang.github.io/ppa/souffle-key.public -O /usr/share/keyrings/souffle-archive-keyring.gpg \
    && echo "deb [signed-by=/usr/share/keyrings/souffle-archive-keyring.gpg] https://souffle-lang.github.io/ppa/ubuntu/ stable main" | tee /etc/apt/sources.list.d/souffle.list \
    && apt-get update && apt-get install -y souffle

WORKDIR /doop
# RUN git clone https://github.com/plast-lab/doop.git .

RUN wget https://github.com/plast-lab/doop/archive/refs/tags/4.25.0.zip -O doop.zip && unzip doop.zip


WORKDIR /doop/doop-4.25.0

RUN ls /doop/JREs/jre1.8/lib


# RUN ./gradlew assemble

# TODO: tamiflex goes here

ENTRYPOINT ["./doop"]

