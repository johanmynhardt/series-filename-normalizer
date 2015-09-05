(ns series-filename-normaliser.core
  (:require [series-filename-normaliser.fs :as fs]))

(defn -main [& args]
  (println (str "PWD: " (fs/cwd)))
  (println (str "Args: " args)))
