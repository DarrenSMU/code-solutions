class Solution:
    def isAlienSorted(self, words: List[str], order: str) -> bool:
        for i in range(len(words)-1):
            word1 = words[i]
            word2 = words[i+1]
            min_length = min(len(word1),len(word2))
            for j in range(min_length):
                if word1[j] != word2[j] :
                    if order.index(word1[j]) > order.index(word2[j]):
                        return False
                    else :
                        min_length = -1
                        break
            if min_length != -1 and len(word1) > len(word2):
                return False
        return True