(ns code-test.core
  (:gen-class))


(defn isValid[check_str]
  (def stack (list))
  (def parentheses(hash-map ")" "(" , "]" "[", "}" "{"))

  (loop [i 0]
    (if(< i (count check_str))
      (do
        (let [ch (subs check_str i (+ i 1))]
          (if (contains? parentheses ch)
            (do
              (if (or (empty? stack) (not= (peek stack) (get parentheses ch)))
                (do
                  (def stack (conj stack ch))
                 )

                (def stack (pop stack))))
            (def stack (conj stack ch)))

          (recur (inc i)))))))




(defn -main
  [& args]

  (isValid "()")
  (println "() :" (empty? stack))

  (isValid "()[]{}")
  (println "()[]{} :"(empty? stack))

  (isValid "(]")
  (println "(] :"(empty? stack))

  (isValid "([)]")
  (println "([)] :"(empty? stack))

  (isValid "{[]}")
  (println "{[]} :"(empty? stack))

  (isValid "{[}]()")
  (println "{[}]() :"(empty? stack))





  )



