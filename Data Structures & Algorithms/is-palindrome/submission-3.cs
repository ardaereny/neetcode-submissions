public class Solution
{
    public bool IsPalindrome(string s)
    {
        int left = 0;
        int right = s.Length - 1;

        string regulatedString = s.ToLowerInvariant();

        while (left < right)
        {
            while (left < right && !char.IsLetterOrDigit(regulatedString[left]))
            {
                left++;
            }

            while (left < right && !char.IsLetterOrDigit(regulatedString[right]))
            {
                right--;
            }

            if (regulatedString[left] != regulatedString[right])
            {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}