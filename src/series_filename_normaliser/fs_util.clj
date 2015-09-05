(ns series-filename-normaliser.fs-util
  (:require [series-filename-normaliser.str-util :as str-util])
  (:import (java.io File)))

(defn contains-char? [file char]
  (.contains (.getName file) char))

(defn contains-space? [file]
  (contains-char? file " "))

(defn contains-open-parenthesis? [file]
  (contains-char? file "("))

(defn contains-close-parenthesis? [file]
  (contains-char? file ")"))

(defn rename-fn-replace-spaces [^File file]
  (let [src (.getName file)
        target (clojure.java.io/file (.getParentFile file) (str-util/replace-strings src " " "_"))]
    target))