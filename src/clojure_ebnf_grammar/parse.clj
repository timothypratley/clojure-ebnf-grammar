(ns clojure-ebnf-grammar.parse
  (:require [instaparse.core :as insta]
            [clojure.java.io :as io]))

(insta/defparser parse-clojure
  (io/resource "clojure.ebnf")
  :auto-whitespace :comma)
