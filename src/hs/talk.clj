(ns hs.talk
  (:gen-class))

(def http-url-con clojure.java.net.HttpURLConnection)
(def api-url new http-url-con.URL("url here"))


(defn talks
  [uname pwd])
