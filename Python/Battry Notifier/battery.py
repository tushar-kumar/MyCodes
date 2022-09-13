import psutil
import time
from plyer import notification


def notify():
    if percent<75 and btry.power_plugged==False:
        notification.notify(
            title = "**Please connect the charger!!",
            message = f"You have to connect the power or turn off the computer. Your battery percentage is {percent}",
            app_icon = "E:\Drive_G\Downloads\ico\Graphicloads-Battery-Battery-bar-1.ico",
            timeout  = 6
        )

while True:
    btry = psutil.sensors_battery()
    percent = int(btry.percent)
    notify()
    time.sleep(20)