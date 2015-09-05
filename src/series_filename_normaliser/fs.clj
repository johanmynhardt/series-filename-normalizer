(ns series-filename-normaliser.fs)

(def wd (clojure.java.io/file "/home/johan/Videos/series/Shameless/Season 4"))

(defn list-files
  [dir]
  (filter #(.getName %) (.listFiles dir)))