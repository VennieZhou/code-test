(ns code-test.core
  (:gen-class))


(defn isValid[check_str]
  (def stack (list))
  (def parentheses(hash-map ")" "(" , "]" "[", "}" "{"))



  (if(> (count check_str) 1)
  (do
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
          (recur (inc i))))))
  (empty? stack))
  (> (count check_str) 1)))






(defn -main
  [& args]
  (println (isValid ""))
  (println (isValid "("))
  (println (isValid "()"))
  (println (isValid "()[]{}"))
  (println (isValid "(]"))
  (println (isValid "([)]"))
  (println (isValid "{[]}"))
  (println (isValid "{[}]()"))







  )



