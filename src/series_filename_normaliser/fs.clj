(ns series-filename-normaliser.fs
  (:import (java.io File)))

(def wd (clojure.java.io/file "/home/johan/Videos/series/Shameless/Season 4"))

(defn list-files [dir filename-filter]
  (filter filename-filter (.listFiles dir)))

(defn cwd []
  (System/getProperty "user.dir"))

(defn move-file [^File file rename-fn]
  (println (str "rename-fn: " rename-fn))
  (let [target (rename-fn file)]
    (println (str "moving file '" file "' to '" target "'"))
    (.renameTo file target)))