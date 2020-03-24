(ns clojure-ebnf-grammar.parse-test
  (:require [clojure.test :refer [deftest is]]
            [clojure-ebnf-grammar.parse :as p]))

(deftest parser-test
  (is p/parse-clojure)
  (is (= '([:list [:symbol "foo"] [:symbol "bar"]])
         (p/parse-clojure "(foo bar)")))
  (is (= '([:list [:symbol "ns"] [:symbol "foo"]]
           [:map [:keyword ":a"] [:keyword ":b"]]
           [:vector [:long "1"] [:long "2"] [:long "3"]]
           [:set [:long "1"] [:long "2"] [:long "3"]]
           [:current_namespace_keyword "::bar"]
           [:char_named "\\tab"]
           [:boolean "true"]
           [:boolean "false"]
           [:string "\"a string\""]
           [:regex "#\"regex\""]
           [:hex "0xFF"]
           [:let [:vector [:symbol "a"] [:long "1"] [:gensym "c#"] [:char_u "\\u1234"]] [:binary "0b1010"]]
           [:double "0.1"]
           [:unquote_splicing [:symbol "x"]]
           [:deref [:symbol "x"]]
           [:unquote [:symbol "x"]])
         (p/parse-clojure
           "(ns foo)
            {:a :b}
            [1 2 3]
            #{1 2 3}
            ::bar
            \\tab
            true
            false
            \"a string\"
            #\"regex\"
            0xFF
            (let [a 1
                  c# \\u1234]
              0b1010)
            0.1
            ~@x
            @x
            ~x"))))
