FROM selenium/node-chrome:3.141.59-selenium
#FROM selenium/node-chrome:3.141.59-oxygen

#FROM zenika/alpine-chrome

#RUN mkdir /Testing

#WORKDIR /Testing

COPY . .
EXPOSE 4444

ENTRYPOINT ["/entrypoint.sh"]
