import pyttsx3
import speech_recognition as sr
import datetime
import wikipedia
import webbrowser
import os
import smtplib


engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
engine.setProperty('voices',voices[1].id)


def speak(audio):
    engine.say(audio)
    engine.runAndWait()

def wishMe():
    hour = int(datetime.datetime.now().hour)
    if hour>=0 and hour<12:
        speak("Good Morning!")

    elif hour>=12 and hour<18:
        speak("Good Afternoon!")

    else:
        speak("Good Evening!")

    speak("I am Jarvis Sir, please tell me How may I help you!")

def takeCommand():
    r = sr.Recognizer()
    with sr.Microphone() as source:
        print("Listening...")
        r.pause_threshold = 1
        audio = r.listen(source)

    try:
        print("Recognizing...")
        quary = r.recognize_google(audio, language='en-in')
        print("User Said:", quary)

    except Exception as e:
        # print(e)
        print("Say that again please...")
        return "None"
    return quary

def sendEmail(to, content):
    server = smtplib.SMTP('smtp.gmail.com', 587)
    server.ehlo()
    server.starttls()
    server.login('atul201kumar@gmail.com', 'password-likh')
    server.sendmail('atul201kumar@gmail.com', to, content)
    server.close()

if __name__ == '__main__':
    wishMe()
    while True:
        query = takeCommand().lower()

        if 'wikipedia' in query:
            speak('Searching Wikipedia...')
            query = query.replace("wikipedia", "")
            results = wikipedia.summary(query, sentences=2)
            speak("According to Wikipedia")
            print(results)
            speak(results)

        elif 'open youtube' in query:
            webbrowser.open("youtube.com")

        elif 'open google' in query:
            webbrowser.open("google.com")

        elif 'open facebook' in query:
            webbrowser.open("facebook.com")

        elif 'open stackoverflow' in query:
            webbrowser.open("stackoverflow.com")


        elif 'play music' in query:
            music_dir = 'D:\\mp3\\fav'
            songs = os.listdir(music_dir)
            print(songs)
            os.startfile(os.path.join(music_dir,song[0]))


        elif 'open anaconda' in query:
            anac = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Anaconda3 (64-bit)\\Anaconda Navigator"
            os.startfile(anac)

        elif 'open code' in query:
            vscode = "C:\\Users\\Ganpati Enterprises\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe"
            os.startfile(vscode)


        elif 'email to sam' in query:
            try:
                speak("What should I say?")
                content = takeCommand()
                to = "tushar201kumar@gmail.com"
                sendEmail(to, content)
                speak("email has been sent.")
            except Exception as e:
                print(e)
                speak("Sorry sir, I am not able to send email to Sam")

