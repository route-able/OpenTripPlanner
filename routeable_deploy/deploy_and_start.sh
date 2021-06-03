#!/bin/sh


# Build the package with Maven
mvn package
# Copy the built JAR to the OTP server
scp target/otp-*-shaded.jar otp@routeotp:/opt/routeable-otp/otp-shaded.jar
ssh otp@routeotp 'screen -d -m "cd /opt/routeable-otp && ./start_otp.sh"'
