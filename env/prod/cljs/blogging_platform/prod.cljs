(ns blogging-platform.prod
  (:require [blogging-platform.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
