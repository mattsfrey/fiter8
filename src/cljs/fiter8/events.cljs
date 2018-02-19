(ns fiter8.events
  (:require [re-frame.core :as re-frame]
            [fiter8.db :as db]))

(re-frame/reg-event-db
 :initialize-db
 (fn  [_ _]
   db/default-db))
