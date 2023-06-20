import sys
import random 
import time
from Adafruit_IO import MQTTClient

AIO_FEED_ID = ["sensor1", "sensor2", "sensor3"]
AIO_USERNAME = "daddyDat"
AIO_KEY = ""


def connected(client):
    print("Connected...")
    for i in range(len(AIO_FEED_ID)):
        client.subscribe(AIO_FEED_ID[i])


def subscribe(client, userdata, mid, granted_qos):
    print("Subscribed...")


def disconnected(client):
    print("Disconnected...")
    sys.exit(1)


def message(client, feed_id, payload):
    print("recieved data: "+payload)
client=MQTTClient(AIO_USERNAME,AIO_KEY)
client.on_connect=connected
client.on_disconnect=disconnected
client.on_message=message
client.on_subscribe=subscribe
client.connect()
client.loop_background()
while True:
    time.sleep(5)
    value1 = random.randint(0, 50)
    value2 = random.randint(0, 100)
    value3 = random.randint(0, 100)
    print("Updating ...")
    client.publish("sensor1", value1)
    client.publish("sensor2", value2)
    client.publish("sensor3", value3)
    pass
